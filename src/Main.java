public class Main {
    public static void main(String[] args) {

        //Has matching parenthesis test
        /*String test1 = new String("(Solution)");
        String test2 = new String("((Solution)");
        String test3 = new String("(Solution))");
        String test4 = new String("((Solution))");
        String test5= new String("Solution()");
        String testX= new String("Solution)(");

        System.out.println(Practice.hasMatchingParenthesis(test1));
        System.out.println(Practice.hasMatchingParenthesis(test2));
        System.out.println(Practice.hasMatchingParenthesis(test3));
        System.out.println(Practice.hasMatchingParenthesis(test4));
        System.out.println(Practice.hasMatchingParenthesis(test5));
        System.out.println(Practice.hasMatchingParenthesis(testX));*/

        //Find non-matching elements in 2 data sets
        /*int[] array1 = {2, 5, 56, 98, 74};
        int[] array2 = {20, 5, 56, 98, 745};

        System.out.println(Practice.findMissingElements(array1, array2).toString());*/

        //Check whether a LinkedList is Cyclic
        /*ListNode node1 = new ListNode(5);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(7);
        node1.next.next.next = new ListNode(8);
        node1.next.next.next.next = null;

        System.out.println("Is the LinkedList cyclic : " + Practice.isACyclicLinkedList(node1));

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(7);
        node2.next.next.next = new ListNode(8);
        node2.next.next.next.next = node2;

        System.out.println("Is the LinkedList cyclic : " + Practice.isACyclicLinkedList(node2));*/

        /* *************************************** Leetcode challenges ******************************************** */

        //88. Merge Sorted Array
        /*int[] sample1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] sample2 = new int[]{2, 5, 6};
        Practice.mergeSortedArrays(sample1, 3, sample2, 3);*/

        /*int[] sample1 = new int[]{0};
        int[] sample2 = new int[]{1};
        Practice.mergeSortedArrays(sample1, 0, sample2, 1);*/

        //27. Remove Element
        /*int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(LeetCode.removeElement(nums, val));*/

        //26. Remove Duplicates from Sorted Array
        /*int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Unique elements count:" + LeetCode.removeDuplicates(nums));*/

        //80. Remove Duplicates from Sorted Array II

        




    }
}