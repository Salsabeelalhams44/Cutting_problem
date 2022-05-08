
## B. Cutting 
time limit per test: 2 seconds <br>
memory limit per test: 256 megabytes <br>
input: standard input<br>
output: standard output<br><br>
There are a lot of things which could be cut — trees, paper, "the rope". In this problem you are going to cut a sequence of integers.

There is a sequence of integers, which contains the equal number of even and odd numbers. Given a limited budget, you need to make maximum possible number of cuts such that each resulting segment will have the same number of odd and even integers.

Cuts separate a sequence to continuous (contiguous) segments. You may think about each cut as a break between two adjacent elements in a sequence. So after cutting each element belongs to exactly one segment. Say, [4,1,2,3,4,5,4,4,5,5] → two cuts → [4,1|2,3,4,5|4,4,5,5]. On each segment the number of even elements should be equal to the number of odd elements.

The cost of the cut between x and y numbers is |x−y| bitcoins. Find the maximum possible number of cuts that can be made while spending no more than B bitcoins.

Input
First line of the input contains an integer n (2≤n≤100) and an integer B (1≤B≤100) — the number of elements in the sequence and the number of bitcoins you have.

Second line contains n integers: a1, a2, ..., an (1≤ai≤100) — elements of the sequence, which contains the equal number of even and odd numbers

Output
Print the maximum possible number of cuts which can be made while spending no more than B bitcoins.

<b>Examples</b>

input: <br>
6 4<br>
1 2 5 10 15 20<br>
output: <br>
1<br>


input:<br>
4 10<br>
1 3 2 4<br>
output:<br>
0<br>

input:<br>
6 100<br>
1 2 3 4 5 6<br>
output:<br>
2<br>

<b>Note</b> <br>
In the first sample the optimal answer is to split sequence between 2 and 5. Price of this cut is equal to 3 bitcoins.

In the second sample it is not possible to make even one cut even with unlimited number of bitcoins

In the third sample the sequence should be cut between 2 and 3, and between 4 and 5. The total price of the cuts is 1+1=2 bitcoins.<br>
<b>Codeforces  problem link:</b>
https://codeforces.com/contest/998/problem/B
