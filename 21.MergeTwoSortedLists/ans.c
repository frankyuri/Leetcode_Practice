struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    if(!l1) return l2;
    if(!l2) return l1;
    if(!l1&&!l2) return NULL;
    struct ListNode *head;
    if(l1->val>l2->val)
    {
        head=l2;
        l2=l2->next;
    }
    else
    {
        head=l1;
        l1=l1->next;
    }
    struct ListNode *c=head;
    while(l1&&l2)
    {
        if(l1->val>l2->val)
        {
            c->next=l2;
            l2=l2->next;;
        }
        else
        {
            c->next=l1;
            l1=l1->next;
        }  
        c=c->next;
    }
     if(l1)
        c->next = l1;
    else
        c->next = l2;
    return head;
    
}