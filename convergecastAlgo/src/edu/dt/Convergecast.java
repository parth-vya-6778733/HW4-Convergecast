package edu.dt;



import java.util.LinkedList;

import java.util.Queue;

import java.lang.String;



public class Convergecast {


    private String nodesConcatenated = "";


    public static class TreeNode

    {

        int data;

        TreeNode left;

        TreeNode right;

        TreeNode(int data)

        {

            this.data=data;

        }

    }



// Recursive Solution

/*

Implement the converge-cast algorithm as a recursion. [Input to the program is the root of the tree]



                Steps for getting maximum element in treegiven in HW4

                first find maximum element in left subtree

                then find maximum element in right subtree

                Compare maximum of above subtrees to current node

                We will find maximum element returned to root with above steps



                 A tree is given in which each node has an integer (> 0 )value stored.  Program here is:



1- The root has the max values from all the nodes.



2- The root has all the values of all the nodes concatenated

                *

                */

    public int getMaximumRec(TreeNode root)

    {

        int max=Integer.MIN_VALUE;

        int value=0;

        int left,right;

        if(root != null)

        {

            value=root.data;

            left=getMaximumRec(root.left);

            right=getMaximumRec(root.right);

            this.toString(root);


            if(left>right)

            {

                max=left;
      //          System.out.println(max);

            }

            else

            {

                max=right;
             //   System.out.println(max);
            }



            if(max < value)

            {

                max=value;
            //    System.out.println(max);
            }

        }



        return max;

    }

    public void toString(TreeNode root)
    {
        nodesConcatenated = nodesConcatenated + Integer.toString(root.data) + "";
    }

    public static  String nodesconcatenateRec(TreeNode root)

    {

        //int max=Integer.MIN_VALUE;

// int value=0;

// int left,right;

        if(root == null)

            return null;

        // root ->left -> right per-order

        String var1 =Integer.toString(root.data);

        //  value=root.data;

        //concat

        {

            if (root.left != null)

            {
                var1 = var1.concat(Integer.toString(root.left.data));
                nodesconcatenateRec(root.left);
            }



            // value=root.data;

            //concat

            if (root.right != null)

            {

                    var1= var1.concat(Integer.toString(root.right.data));

                    //  System.out.println(var1);


                nodesconcatenateRec(root.right);

            }

        }

        return var1;





    }



    public static void main(String[] args)

    {

        Convergecast bi=new Convergecast();

        // Creating a binary tree

        TreeNode rootNode=createBinaryTree();

        System.out.println("Max node using recursion :"+bi.getMaximumRec(rootNode));

        System.out.println("Root has values of all the nodes concatenated :"+bi.nodesConcatenated);

    }



    public static TreeNode createBinaryTree()

    {



        // I used tree which was given in Homework4

                 /*          						2  (Root)

                  *                            / \

                  *                            7   5

                  *                            /\   \

                  *                            2 6    9

                  *                              /\   /

                  *                            5  11  4

                  *

                  *

                  * */

        TreeNode rootNode =new TreeNode(2);

        TreeNode node20=new TreeNode(7);

        TreeNode node10=new TreeNode(5);

        TreeNode node30=new TreeNode(2);

        TreeNode node60=new TreeNode(6);

        TreeNode node50=new TreeNode(9);

        TreeNode node70=new TreeNode(5);

        TreeNode node90=new TreeNode(11);

        TreeNode node80=new TreeNode(4);



        rootNode.left=node20;



        node20.left=node30;

        node20.right=node60;



        node60.left=node70;

        node60.right=node90;



        rootNode.right=node10;

        node10.right=node50;

        node50.left=node80;



        return rootNode;

    }

}