
// Lab09Ast.java
// This is the student, starting file of Lab 09A.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the re-defined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.

import java.awt.*;
import java.applet.*;



public class Lab09Ast extends Applet
{
    public void paint(Graphics g)
    {
        XmasTree myTree = new XmasTree();
        myTree.drawTrunk(g);
        myTree.drawLeaves(g);
        myTree.drawOrnaments(g);
    }
}

class Tree
{
    // Do NOT alter this Tree class in any way!

    public void drawTrunk(Graphics g)
    {
        Expo.setColor(g,Expo.brown);
        Expo.fillRectangle(g,475,395,525,600);
    }

    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillCircle(g,500,300,100);
    }
}

class PineTree extends Tree
{
    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        int x1 = 300;
        int x2 = 700;
        int x3 = 500;
        int y1 = 400;
        int y2 = 400;
        int y3 = 200;
        Expo.fillPolygon(g,x1,y1,x2,y2,x3,y3);
        Expo.fillPolygon(g,x1+50,y1-100,x2-50,y2-100,x3,y3-100);
        Expo.fillPolygon(g,x1+130,y1-200,x2-130,y2-200,x3,y3-130);
    }
}

class XmasTree extends PineTree
{
    public void drawOrnaments(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        int x = 400;
        int y = 350;
        int r = 15;
        Expo.fillCircle(g,x,y,r);
        Expo.fillCircle(g,x+150,y+5,r);
        Expo.fillCircle(g,x+100,y-200,r);
        Expo.fillCircle(g,x+90,y-150,r);
        Expo.fillCircle(g,x+50,y-50,r);
        Expo.fillCircle(g,x+80,y-50,r);
        Expo.fillCircle(g,x+110,y-50,r);
        Expo.fillCircle(g,x+140,y-50,r);
        Expo.fillCircle(g,x+170,y-50,r);
        Expo.fillCircle(g,x+140,y-100,r);
    }
}