/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TodoAppfpm.controller;

import TodoAppfpm.model.Task;
import TodoAppfpm.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;

/**
 *
 * @author ty_jo
 */
public class TaskController {
    
    public void save(Task task){
        String sql = "INSERT INTO tasks(idProject, name, description, completed, notes, deadline, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            //Cria uma conex�o com o banco
            conn = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, task.getIdProject());
            stmt.setString(2, task.getName());
            stmt.setString(3, task.getDescription());
            stmt.setBoolean(4, task.isCompletedAt());
            stmt.setString(5, task.getNotes());
            stmt.setDate(6, new Date(task.getDeadline().getTime()));
            stmt.setDate(7, new Date(task.getCreatedAt().getTime()));
            stmt.setDate(8, new Date(task.getUpdatedAt().getTime()));

            //Executa a sql para inser��o dos dados
            stmt.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa " + ex.getMessage(), ex);
        } finally {
            //Fecha as conex�es
           
                ConnectionFactory.closeConnection(conn, stmt);
            
        }
    }
    
    public void update (Task task){
        
    }
    
    public void removeById(int taskId){
       String sql = "DELETE FROM tasks WHERE id = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, taskId);
            stmt.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa", ex);
        } finally {
          
               ConnectionFactory.closeConnection(conn, stmt);
           
        }
        
   }
    
    public List<Task> getAll(int idProject){
        return null;
    }
    
}
