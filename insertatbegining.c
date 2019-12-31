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
void insertatbegin(int m)
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
void insertatpos(int l,int m)
{
    struct node* temp=create(m);
    struct node *temp1=head,*temp2;
    if(head==NULL||l==0)
    {
        insertatbegin(m);
    }
    else
    {
    while(l--)
    {
         temp2=temp1;
        temp1=temp1->next;
        if(temp1==NULL)
        {
            break;
        }
       
        
    }
   temp->next=temp1;
    temp2->next=temp;
   // head=temp1;
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
int n,l,m;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d %d",&l,&m);
        insertatpos(l,m);
    }
    print();
    return 0;
}
