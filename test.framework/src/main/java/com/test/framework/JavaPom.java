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

public class JavaPom {
    private Type[] type;

    public Type[] getType ()
    {
        return type;
    }

    public void setType (Type[] type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "JavaPom [type = "+type+"]";
    }

}
