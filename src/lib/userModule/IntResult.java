/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.userModule;

/**
 *
 * @author Neel Patel
 */
public interface IntResult {
     long getRunTime()throws TimelimitExceededException;
     String getMessage();
}
