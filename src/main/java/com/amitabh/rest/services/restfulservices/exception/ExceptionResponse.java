package com.amitabh.rest.services.restfulservices.exception;

import java.util.Date;

public class ExceptionResponse {
    
    //timestamp
    
    private Date timestamp;
    //exception message
    
    private String message;
    
    //detail
    
    private String detail;
    
    

    public ExceptionResponse(Date timestamp, String message, String detail) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.detail = detail;
    }



    public ExceptionResponse() {
        // TODO Auto-generated constructor stub
    }



    /**
     * @return the timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }



    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }



    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }



    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }



    /**
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }



    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

}
