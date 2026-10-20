/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

         ListNode finalHead=null;
        ListNode head=null;
        ListNode temp;
        int count=0;
        int count2=0;
        int count3=0;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                count++;
                
                
                ListNode nex = list1.next;
                if(head==null)
                {
                    head = list1;
                    head.next=null;
                }
                else
                {   
                    head.next=list1;
                    head=head.next;
                    head.next=null;
                }

                list1= nex;;
                if(count==1)
                {
                    finalHead = head;
                }

            }
            else{

                count++;

                ListNode nex = list2.next;
                if(head==null)
                {
                    head = list2;
                    head.next=null;
                }
                else
                {   
                    head.next=list2;
                    head=head.next;
                    head.next=null;
                }
                list2= nex;
                if(count==1)
                {
                    finalHead = head;
                }

                
            }
        }

        while(list1!=null){
            if(finalHead==null && count2 ==0){
                finalHead = list1;
                count2++;
            }
            ListNode nex = list1.next;
            if(head!=null){
                head.next=list1;
                head= head.next;
                head.next=null;
            }
            else{
                head= list1;
                head.next=null;
            }
            list1=nex;
        }

        while(list2!=null){
             if(finalHead==null && count3 ==0){
                finalHead = list2;
                count3++;
            }
            ListNode nex = list2.next;
            if(head!=null){
                head.next=list2;
                head= head.next;
                head.next=null;
            }
            else{
                head= list2;
                head.next=null;
            }
            list2=nex;
            
        }

        return finalHead;
        // 
        
    }
}