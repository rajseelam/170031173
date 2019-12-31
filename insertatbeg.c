#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node* next;
}*head=NULL;
struct node* create(int m)
{
  struct node* temp=(struct node*)malloc(sizeof(struct node));
    temp->data=m;
    temp->next=NULL;
    return temp;
}
void insertintolist(int m)
{
    struct node* temp=create(m);
   if(head==NULL)
   {
       head=temp;
   }
    else{
    temp->next=head;
    head=temp;
    }
}
void print()
{
    struct node* temp1=head;
    while(temp1->next!=NULL)
    {
        printf("%d->",temp1->data);
        temp1=temp1->next;
    }
    printf("%d",temp1->data);
}

int main() {
    int n,m;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
      scanf("%d",&m);
        insertintolist(m);
    }
    print();

      
    return 0;
}
