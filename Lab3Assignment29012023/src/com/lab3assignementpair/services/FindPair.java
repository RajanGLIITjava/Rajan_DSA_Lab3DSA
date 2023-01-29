package com.lab3assignementpair.services;

class FindPair 
{
	
	Node root;
    FindPair() 
	    	{ 
	    	root = null; 
	    	}
	    void insert(int key) 
	    	{ 
	    	root = insertRec(root, key); 
	    	}
	 
	    Node insertRec(Node root, int data)
	    {
	        if (root == null) 
		        {
		            root = new Node(data);
		            return root;
		        }

	        if (data < root.data)
	            root.left = insertRec(root.left, data);
	        else if (data > root.data)
	            root.right = insertRec(root.right, data);
	
	        return root;
	    }
   
    boolean isPairPresent(Node root, Node temp, int target)
    {
        if (temp == null)
            return false;
 
        return search(root, temp, target - temp.data)
            || isPairPresent(root, temp.left, target)
            || isPairPresent(root, temp.right, target);
    }
 
    boolean search(Node root, Node temp, int k)
    {
 
        if (root == null)
            return false;
 
        Node result = root;
        boolean flag = false;
        while (result != null && flag != true) {
            if (result.data == k && temp != result) {
                flag = true;
                System.out.println("Sum of the Value"  + " Pair is " + result.data
                                   + " , " + temp.data);
                return true;
            }
            else if (k < result.data)
                result = result.left;
            else
                result = result.right;
        }
 
        return false;
    }
}