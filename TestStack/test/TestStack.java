import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import org.junit.Test;

public class TestStack {
	Stack<Integer> stack = new Stack<Integer>();
	
	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}*/

	@Test
	public void testIsEmpty(){
	       //Stack stack = new Stack(5);
	       boolean empty = stack.isEmpty();
	       assertTrue("Stack is empty",empty);
	}
	
	@Test
	public void testPush(){
	       //Stack stack = new Stack(5);
	       Integer i = 0;
	       stack.push(i);
	       assertFalse("Stack size = 1",stack.isEmpty());
	       
	       Stack<Double> stackDouble = new Stack<Double>();
	       Double f = 0.1;
	       stackDouble.push(f);
	       assertFalse("Stack size = 1",stackDouble.isEmpty());
	}
	
	@Test
	public void testPushPop(){
	       //Stack stack = new Stack(5);
	       stack.push(0);
	       stack.pop();
	       assertTrue("Stack is empty",stack.isEmpty());
	}
	
	@Test
	public void testPushPop1Object(){
	       //Stack stack = new Stack(1);
	       int test = 155;
	       stack.push(test);
	       int pop = stack.pop();
	       assertEquals("Stack value is the same",test,pop);
	}
	
	@Test
	public void testPushPop3Object(){
	       //Stack stack = new Stack(3);
	       int value[] = {15641,99877,3269710};
	       int popValue;
	       for(int i=0;i<3;i++)
	       {
	    	   stack.push(value[i]);
	       }
	       
	       for(int i=0;i<3;i++)
	       {
	    	   popValue = stack.pop();
	    	   assertEquals("Stack value is the same",value[2-i],popValue);
	       }
	}
	
	@Test
	public void testPushPopNTime(){
	       //Stack stack = new Stack(3);
	       int value[] = {15641,99877,3269710};
	       int popValue=0;
	       for(int i=0;i<3;i++)
	       {
	    	   stack.push(value[i]);
	    	   popValue = stack.pop();
	       }
	       
	       assertEquals("Stack value is the same",value[2],popValue);
	}
	
	/*@Test (expected = IllegalStateException.class)
	public void testOverFlow(){
	       //Stack stack = new Stack(2);
	       stack.push(0);
	       stack.push(0);
	       stack.push(0);
	       fail("push in full stack");
	}*/
	
	@Test (expected = NoSuchElementException.class)
	public void testPopEmptyStack(){
	       //Stack stack = new Stack(2);
	       stack.pop();
	       fail("pop empty stack");
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testTopWithIsEmpty(){
	       //Stack stack = new Stack(2);
	       stack.push(0);
	       int top = stack.top();
	       assertFalse("Stack size = 1",stack.isEmpty());
	}
	
	@Test
	public void testTop1(){
	       //Stack stack = new Stack(2);
	       int value = 460;
	       stack.push(value);
	       int top = stack.top();
	       assertEquals("Stack value is ok",value,top);
	}
	
	@Test
	public void testTopN(){
	       //Stack stack = new Stack(10);
	       int values[] = {460,6,9,8,7,41,3,67,5};
	       for(int i=0;i<values.length;i++)
	       {
	    	   stack.push(values[i]);
	       }
	       int top = stack.top();
	       assertEquals("Top value is ok",values[values.length-1],top);
	}
	
	@Test
	public void testNTop(){
		   //Stack stack = new Stack(2);
	       int value = 460;
	       int top=0;
	       stack.push(value);
	       for(int i=0;i<10;i++)
	       {
	    	   top = stack.top();
	       }
	       assertEquals("Top value is the same",value,top);
	}
	
	@SuppressWarnings("unused")
	@Test(expected = NoSuchElementException.class)
	public void testTopEmptyStack(){
		   //tack stack = new Stack(2);
	       Integer top = stack.top();
	       fail("Top on empty stack");
	}
	
	@Test
	public void PushNull(){
		   //Stack stack = new Stack(2);
		   Integer i = null;
	       stack.push(i);
	       assertFalse("Stack size = 1",stack.isEmpty());
	}

}
