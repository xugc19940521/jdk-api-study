package com.xugc.lang;

import org.junit.Assert;
import org.junit.Test;

/**
 * @CLassName BooleanDemo
 * @Description
 * @Author xugc
 * @Date 2019/4/21 22:19
 * @Version 1.0
 */
public class BooleanDemo {

    @Test
    public void testBooleanFields(){
        //true
        System.out.println(Boolean.TRUE);
        //false
        System.out.println(Boolean.FALSE);
        //boolean
        System.out.println(Boolean.TYPE);
    }


    @Test
    public void testBooleanConstructors(){
        Boolean flagTrue = new Boolean(true);
        Boolean flagFalse = new Boolean(false);

        Boolean flagTrueStr = new Boolean("true");
        Boolean flagFalseStr = new Boolean("false");

        Boolean flagTrueStr1 = new Boolean("test");
        Boolean flagFalseStr2 = new Boolean("test1");

        // 1. passed
        Assert.assertEquals(flagTrue, flagTrueStr);
        // 2.failed
        Assert.assertEquals(flagTrue, flagTrueStr1);
        // 3.passed
        Assert.assertEquals(flagFalse,flagFalseStr);
        // 4.passed
        Assert.assertEquals(flagFalse,flagFalseStr2);
        // 5.passed
        Assert.assertEquals(flagFalse,flagTrueStr1);
    }

    @Test
    public void testBooleanValue(){
        Boolean flagTrue = new Boolean(true);
        //true
        System.out.println(flagTrue.booleanValue());
        //false
        Boolean flagFalse = new Boolean(false);
        System.out.println(flagFalse.booleanValue());
    }

    @Test
    public void testCompare(){
        Boolean flagTrue = new Boolean(true);
        Boolean flagFalse = new Boolean(false);

        // 0
        System.out.println(Boolean.compare(true,true));
        // 1
        System.out.println(Boolean.compare(true,false));
        // -1
        System.out.println(Boolean.compare(false,true));
        // 0
        System.out.println(Boolean.compare(false,false));

        // 0
        System.out.println(Boolean.compare(flagTrue,flagTrue));
        // 1
        System.out.println(Boolean.compare(flagTrue,flagFalse));
        // -1
        System.out.println(Boolean.compare(flagFalse,flagTrue));
        // 0
        System.out.println(Boolean.compare(flagFalse,flagFalse));
    }

    @Test
    public void testCompareTo(){
        Boolean flagTrue = new Boolean(true);
        Boolean flagFalse = new Boolean(false);

        //1
        System.out.println(flagTrue.compareTo(flagFalse));
    }


    @Test
    public void testEquals(){
        Boolean flagTrue = new Boolean(true);
        System.out.println(flagTrue.equals(true));
    }

    @Test
    public void testGetBoolean(){
        //false
        System.out.println(Boolean.getBoolean("123"));
        //false
        System.out.println(Boolean.getBoolean("true"));

        System.setProperty("true","true");
        //true
        System.out.println(Boolean.getBoolean("true"));

        //false
        System.setProperty("true","123");
        System.out.println(Boolean.getBoolean("true"));

        //true
        System.setProperty("123","true");
        System.out.println(Boolean.getBoolean("123"));

    }

    @Test
    public void testLogicalAnd(){
        //true
        System.out.println(Boolean.logicalAnd(true,true));
        //false
        System.out.println(Boolean.logicalAnd(true,false));
        //false
        System.out.println(Boolean.logicalAnd(false,true));
        //false
        System.out.println(Boolean.logicalAnd(false,false));
    }

    @Test
    public void testLogicalOr(){
        //true
        System.out.println(Boolean.logicalOr(true,true));
        //true
        System.out.println(Boolean.logicalOr(true,false));
        //true
        System.out.println(Boolean.logicalOr(false,true));
        //false
        System.out.println(Boolean.logicalOr(false,false));
    }

    @Test
    public void testLogicalXor(){
        //false
        System.out.println(Boolean.logicalXor(true,true));
        //true
        System.out.println(Boolean.logicalXor(true,false));
        //true
        System.out.println(Boolean.logicalXor(false,true));
        //false
        System.out.println(Boolean.logicalXor(false,false));
    }

    @Test
    public void testParseBoolean(){
        //false
        System.out.println(Boolean.parseBoolean("123"));
        //true
        System.out.println(Boolean.parseBoolean("true"));
    }

    @Test
    public void testValueof(){

        //true
        Boolean t = Boolean.valueOf(true);
        System.out.println(t.booleanValue());

        //false
        t = Boolean.valueOf("123");
        System.out.println(t.booleanValue());

        //true
        t = Boolean.valueOf("true");
        System.out.println(t.booleanValue());
    }
}

