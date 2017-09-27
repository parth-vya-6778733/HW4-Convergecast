Homework 4: Readme.txt
 converge-cast algorithm as a recursion

The convergecast algorithm is the inverse of a broadcast in a message-passing system ( Flooding)
—instead of a message propagating down from a single root to all nodes,
data is collected from outlying nodes through a direct spanning tree to the root. 
Typically some function is applied to the incoming data at each node to summarize it,
with the goal being that eventually the root obtains this function of all the data in the entire system. 
(Examples would be counting all the nodes or taking an average of input values at all the nodes.)


 converge-cast algorithm :

The basic convergecast algorithm looks like this:

Initially, if I am a leaf: send input to parent.
Upon receiving M from child c:
Append (c, M) to buffer.
If I am not the root and buffer contains messages from all my children:
Send f(messages in buffer + my input) to parent

Description of convergecast algorithm for a specified root:

The details of what is being computed depend on the choice of f:

If input = 1 for all nodes and f is sum, then we count the number of nodes in the system.
If input is arbitrary and f is sum, then we get a total of all the input values.
Combining the above lets us compute averages, by dividing the total of all the inputs by the node count.
If f just concatenates its input, the root ends up with a vector of all input values.

Algorithm analysis:
Implement the converge-cast algorithm as a recursion. input to the program is the root of the tree. 

A tree is given in which each node has an integer (> 0 )value stored. 

1- Program for root has the max values from all the nodes. 

2- Program for root has all the values of all the nodes concatenated 

Running time is bounded by the depth of the tree: we can prove by induction that any node at height h (height is length of the longest path from this node to some leaf) sends a message by time h at the latest. Message complexity is exactly n-1, where n is the number of nodes; this is easily shown by observing that each node except the root sends exactly one message.


Files included in Project:
Convergecast.java

	
		
Tester Cases: 

	We choose to test multiple different nodes as the max value. and also used different roots.
to test our algorithm worked corretcly for both cases where root has the max values from all the nodes. 
& also root has all the values of all the nodes concatenated 
 Verifying what the program outputs to the actual traversal of the algorithm of the tree confirmed that our program was executing the converge-cast algorithm correctly.  
	

