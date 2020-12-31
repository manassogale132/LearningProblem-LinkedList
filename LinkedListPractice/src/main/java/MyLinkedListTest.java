import org.junit.Test;
import org.junit.Assert;

public class MyLinkedListTest {
	
	private MyNode<Integer> linkedlist;
	@Test                                                                                             //UC2
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {                             //My Nodes:56->30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myThirdNode)&&                                    //TestCase
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myFirstNode);
		
		Assert.assertTrue(result);
	}
	
	
	@Test                                                                                          //UC3       
	public void given3NumbersWhenAppendedTShouldBeAddedToLast() {                                 //My Nodes:56->30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&                                  //TestCase
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	
	@Test                                                                                            //UC4                                                                     
	public void given3NumbersWhenInsertingShouldBePassLinkedListResult()   {                         //My Nodes:56->30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		
	        MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&                                 //TestCase
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}

	
	@Test                                                                                                   //UC5
	public void given3NumbersWhenDeleteFirstShouldBePassLinkedListResult() {                                    //My Nodes:30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		 
		 MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.pop();
		myLinkedList.add(myThirdNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(mySecondNode)&&                                //TestCase
				         myLinkedList.head.getNext().equals(myThirdNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	
	@Test                                                                                                   //UC6
	public void given3NumbersWhenDeleteLastNodeShouldBePassLinkedListResult() {                            // My Nodes:56->30
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		 
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.pop();
	
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&                                   //TestCase
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(mySecondNode);
		
		Assert.assertTrue(result);
	}
	
	@Test                                                                                  //UC7
	public void addThreeNumbersAndSearchRequiredNumber() {                                 //My Nodes:30
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		
		Iterator itr = linkedlist.iterator();
		while(itr.hasNext()) {
			if((Integer) itr.next() == 30) {
				System.out.println(" ");
				System.out.println("UC7");
				System.out.println("My Nodes:30");
				
			}
		}		

	boolean result = linkedlist.equals(56)&&                                               ////FalseTestCase
			linkedlist.equals(30)&&
			linkedlist.equals(70);

	Assert.assertFalse(result);    
	}
	
	@Test                                                                                 //UC8
	public void addThreeNumbersAndAddBetweenValues() {                                   //My Nodes:[56, 30, 40, 70]
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		
		linkedlist.add(2, 40);
		
		System.out.println(" ");
		System.out.println("UC8");
		System.out.println(linkedlist);
		

	boolean result = linkedlist.equals(56)&&                                           //FalseTestCase
			linkedlist.equals(30)&&
			linkedlist.equals(70);

	Assert.assertFalse(result);    
	}

}
