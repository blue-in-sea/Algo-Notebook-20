/*
ReOrder Linked List
input:  N1 -> N2 -> N3 -> N4 -> N5 -> N6 -> null 
output: N1 -> N2 -> N3 -> N4 -> N5 -> N6 -> null 
S1. Find the middle node and split it into halves.    O(n)
    N1 -> N2 -> N3 -> null
    N4 -> N5 -> N6 -> null 

S2. Reverse the second half                           O(n) 
    N1 -> N2 -> N3 -> null
    N4 -> N5 -> N6 -> null

S1. Merge the two into the new list                    O(n)  
    N1 -> N2 -> N3 -> null
    N4 -> N5 -> N6 -> null
    
*/
