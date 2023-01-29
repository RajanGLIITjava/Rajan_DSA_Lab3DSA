package com.lab3assignementpair.services;

import com.lab3assignementpair.services.Node;

import com.lab3assignementpair.services.FindPair;

public class Driver {

	public static void main(String[] args) 
	{
		FindPair bTree = new FindPair();
		bTree.insert(40);
		bTree.insert(20);
		bTree.insert(60);
		bTree.insert(10);
		bTree.insert(30);
		bTree.insert(50);
        bTree.insert(70);
        
       //please change the value @ last
        boolean test = bTree.isPairPresent(bTree.root, bTree.root,40);
        
        if (!test)
        	
            System.out.println("No such values are found!");
	}

}
