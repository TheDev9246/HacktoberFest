/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* insertionSortList(ListNode* head) 
    {
        if(!head || !head->next) return head;
        ListNode newHead(0), *pre, *p = head->next, *next = NULL, *tail = NULL;
        newHead.next = head;
        tail = head;
        while(p)
        {
            pre = &newHead;
            next = p->next;
            if(tail->val < p->val)
            {
                tail->next = p;
                tail = tail->next;
            }
            else
            {
                while(pre->next && pre->next->val < p->val) pre = pre->next;
                p->next = pre->next;
                pre->next = p;
            }
            p = next;
        }
        tail->next = NULL;
        return newHead.next;
    }
};
