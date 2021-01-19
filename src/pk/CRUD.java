/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk;

import java.sql.ResultSet;

/**
 *
 * @author Ammar ALwaeli
 */
public interface CRUD {

    public void insert(String tableName, String coloums[], String values[]);

    public void update(String tableName, String values[], String where, String whereValue);

    public void delete(String tableName, String where, String whereValue);

    public ResultSet selectAll(String tableName);

    public ResultSet selectCount(String tableName, String column, String where, String wValue);
    public ResultSet selectAllCount(String tableName, String column);

    public ResultSet selectAllWhere(String tableName, String where, String whereValue);

    public ResultSet selectAll(String tableName, String coloums[]);

    public ResultSet select(String tableName, String coloums[], String where, String whereValue);
}
