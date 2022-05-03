import java.util.NoSuchElementException;

/*
 * Author: Ryan Yu
 * Date: 4/21/22
 * CSE 274 Lab 11
 * Implementation of a heap using a priority queue
 */

public class HeapPriorityQueue<T extends Comparable<? super T>> implements PriorityQueueInterface<T> {

	private T[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	public HeapPriorityQueue() {
		this(DEFAULT_CAPACITY);
	}

	public HeapPriorityQueue(int initialCapacity) {
		elements = (T[]) new Comparable[initialCapacity + 1];
		size = 0;
	}

	public HeapPriorityQueue(T[] entries) {
		this(entries.length + 1);
		size = entries.length;
		for (int index = 0; index < entries.length; index++)
			elements[index + 1] = entries[index];
		for (int rIndex = size / 2; rIndex > 0; rIndex--) 
			reheapDown(rIndex);
	}

	private void reheapDown(int index) {
		int leftChild = index * 2;
		int rightChild = index * 2 + 1;
		while(rightChild <= size || leftChild <= size) {
			// Need to check whether or not children are bigger than parent
			boolean swap = swapWithChildren(index, leftChild, rightChild);
			if(!swap) return;
			int childIndex = getChildIndex(rightChild, leftChild);
			swap(index, childIndex);
			index = childIndex;
			leftChild = index * 2;
			rightChild = index * 2 + 1;
		}
	}

	private boolean swapWithChildren(int index, int leftChild, int rightChild) {
		if(leftChild <= size && elements[index].compareTo(elements[leftChild]) < 0) return true;
		if(rightChild <= size && elements[index].compareTo(elements[rightChild]) < 0) return true;
		return false;
	}

	private int getChildIndex(int rightChild, int leftChild) {
		int ret;
		if(rightChild <= size)
			ret = (elements[leftChild].compareTo(elements[rightChild]) > 0) ? leftChild : rightChild;
		else 
			ret = leftChild;
		return ret;
	}

	private void reheapUp(int index) {
		int parentIndex = index / 2;
		while(parentIndex > 0 && elements[index].compareTo(elements[parentIndex]) > 0) {
			swap(index, parentIndex);
			index = parentIndex;
			parentIndex = index / 2;
		}
	}

	private void swap(int index, int parentIndex) {
		T tmp = elements[index];
		elements[index] = elements[parentIndex];
		elements[parentIndex] = tmp;
	}

	@Override
	public boolean isEmpty() {
		return elements[1] == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void clear() {
		elements = (T[]) new Comparable[elements.length + 1];
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(T newEntry) {
		verifyCapacity();
		elements[++size] = newEntry;
		reheapUp(size);
	}

	private void verifyCapacity() {
		if(size == elements.length - 1) {
			T[] tmp = (T[]) new Comparable[size * 2 - 1];
			for(int i = 1; i <= size; i++)
				tmp[i] = elements[i];
			elements = tmp;
		}
	}

	@Override
	public T peek() {
		if(isEmpty()) return null;
		return elements[1];
	}

	@Override
	public T remove() {
		if(isEmpty()) throw new NoSuchElementException();
		T ret = elements[1];
		swap(1, size);
		elements[size--] = null;
		reheapDown(1);
		return ret;
	}

	@Override
	public String toString() {
		if(isEmpty()) return "[null]";
		String ret = "";
		for(int i = 1; i <= size; i++)
			ret += ", " + elements[i];
		return "[null, " + ret.substring(2) + "]";
	}

}
