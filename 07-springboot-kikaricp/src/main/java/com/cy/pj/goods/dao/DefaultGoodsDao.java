package com.cy.pj.goods.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//
@Repository //此注解通常用于描述数据库访问层的实现类对象，本质是一个特殊的@Component
public class DefaultGoodsDao {
    /**
     *
     */
    //从springboot框架内置的HikariCP连接池中获取链接对象
    @Autowired
    private DataSource dataSource;
    //写一个
    public List<Map<String,Object>> findGoods() {
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        String sql="select * from tb_goods";
        try {
            //获得链接
            conn = dataSource.getConnection();
            //创建statment(传输器)对象、
            //statement=connection.prepareStatement("");
            stat=conn.createStatement();
            //发送sql
            rs=stat.executeQuery(sql);

            //处理结果
            List<Map<String,Object>> list=new ArrayList<>();
            while (rs.next()){

                list.add(rowMap(rs));
            }
            return list;
        }catch (SQLException e){
            e.printStackTrace();
            //转换为非检查异常，（后面不用加return的原因）
            throw new RuntimeException(e);
        }finally {
            close(rs, stat, conn);
        }

    }

    public Map<String,Object> rowMap(ResultSet rs) throws SQLException {
        Map<String,Object > rowMap=new HashMap();
        //获取元数据(包括表中的字段名)
        ResultSetMetaData rsmd=rs.getMetaData();
        //获取列的数量
        int columuCount=rsmd.getColumnCount();
        //遍历所有的列(数据库的索引从1开始)
        for(int i=1;i<=columuCount;i++){
            //rsmd.getColumnLabel(i)根据索引获取表中的字段名或者字段对应的别名
            //rs.getObject(？)根据字段名从结果集中获取一个值（可以获取任意类型）
            rowMap.put(rsmd.getColumnLabel(i),rs.getObject(rsmd.getColumnLabel(i)) );
        }
        return rowMap;

//        rowMap.put("id", rs.getInt("id"));
//        rowMap.put("name", rs.getString("name"));
//        rowMap.put("remark", rs.getString("remark"));
//        rowMap.put("createdTime",rs.getTimestamp("createdTime"));
    }

    public void close(ResultSet resultSet,Statement statement,Connection connection){
        //释放资源
        if (resultSet!=null){
            try {
                resultSet.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if (statement!=null){
            try {
                statement.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
