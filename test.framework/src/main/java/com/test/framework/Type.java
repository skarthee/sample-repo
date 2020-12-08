/* 
 * Licensed Materials - Property of IBM
 *
 * IBM Surveillance Insight for Financial Services, PID 5725-Y79
 * IBM Surveillance Insight for Financial Services on Cloud, PID 5737-A59
 *
 * (c) Copyright IBM Corporation 2017, 2018
 *
 * U.S. Government Users Restricted Rights:  Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp. 
 */

package com.test.framework;

/**
 * Created by sunil.gajula on 4/16/16.
 */


public class Type {

    private Files files;

    private String type_id;

    private String srclocation;

    private String destlocation;

    public Files getFiles ()
    {
        return files;
    }

    public void setFiles (Files files)
    {
        this.files = files;
    }

    public String getType_id ()
    {
        return type_id;
    }

    public void setType_id (String type_id)
    {
        this.type_id = type_id;
    }

    public String getSrclocation ()
    {
        return srclocation;
    }

    public void setSrclocation (String srclocation)
    {
        this.srclocation = srclocation;
    }

    public String getDestlocation() {
        return destlocation;
    }

    public void setDestlocation(String destlocation) {
        this.destlocation = destlocation;
    }

    @Override
    public String toString()
    {
        return "Type [files = "+files+", type-id = "+type_id+", srclocation = "+srclocation+"]";
    }
}
