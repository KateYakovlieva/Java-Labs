package com.tasks3.linkedlist;

public class LinkedList {
	Node head;
	int count;
	
	public LinkedList() {
		head = null;
		count = 0;
	}
	
	public void add(int data) {
		Node node = new Node();
		node.setData(data);
		
		// Head does not exist
		if (head == null) {
			head = new Node();
			head.setData(data);
			count++;
			return;
		}
		
		// Head exists
		Node current = head;
		
		while (current.getNext() != null) {
			current = current.getNext();
		}
		
		current.setNext(node);
		count++;
	}
	
	public Integer get(int index) {
		Node current = head;
		int counter = 0;
		
		if (index > count - 1) {
			return null;
		}
		
		while (current.getNext()!=null && counter<index) {
			current = current.getNext();
			counter++;
		}
		
		return current.getData();
	}
	
	public boolean delete(int index) {
		Node current = head;
		int counter = 0;
		
		if (index > count - 1 || index<0) {
			return false;
		}
		if(count==1){
        head =null;
        count--;
        return true;
        }
		while (current.getNext() != null && counter<index-1 ) {
			current = current.getNext();
			counter++;
		}
		
		current.setNext(current.getNext().getNext());
		count--;
		return true;
	}
	
	public int size() {
		return count ;
	}
	
	}
