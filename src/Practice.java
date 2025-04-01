import java.util.*;

public class Practice {

    public static int getSecondLargestNumber(int[] itemList) {
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int number : itemList) {
            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            } else if (number > secondLargestNumber && number != largestNumber) {
                secondLargestNumber = number;
            }
        }

        if (secondLargestNumber == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number");
        }

        return secondLargestNumber;
    }

    public static boolean hasMatchingParenthesis(String sample) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sample.length(); i++) {
            char current = sample.charAt(i);

            if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                if (!stack.isEmpty())
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static List<Integer> findMissingElements(int[] set1, int[] set2) {
        List<Integer> missingItems = new ArrayList<Integer>();
        HashSet<Integer> dataSet = new HashSet<Integer>();

        for (int value : set1) {
            dataSet.add(value);
        }

        for (int number : set2) {
            if (!dataSet.contains(number)) {
                missingItems.add(number);
            }
        }

        return missingItems;
    }

    public static boolean isACyclicLinkedList(ListNode head) {

        HashSet<ListNode> nodes = new HashSet<>();
        ListNode current = head;

        while (current != null) {
            if (nodes.contains(current))
            {
                return true;
            } else {
                nodes.add(current);
                current = current.next;
            }
        }
        return false;
    }

}
