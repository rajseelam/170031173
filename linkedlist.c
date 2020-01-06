#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node* next;
}*head=NULL;
struct node* createnode(int m)
{
    struct node* temp=(struct node*)malloc(sizeof(struct node));
    temp->data=m;
    temp->next=NULL;
    return temp;
}
void insertatbegin(int m)
{
    struct node* temp=createnode(m);
    if(head==NULL)
    {
        head=temp;
    }else
    {
        temp->next=head;
        head=temp;
    }
}
void insertatend(int m)
{
    struct node* temp=createnode(m);
    struct node *x=head;
    if(head==NULL)
    {
        head=temp;
    }
    else
    {
        while(x->next!=NULL)
        {
            x=x->next;
        }
     x->next=temp;
    }
   
}
void insertatpos(int pos,int data)
{struct node* temp=createnode(data),*x=head,*y;
    if(head==NULL||pos==0)
    {
        insertatbegin(data);
    }
 else{
     while(pos--)
     {
         y=x;
         x=x->next;
     }
    temp->next=x;
     y->next=temp;
     head=y;
     
     
 }
}
void deleteatbegin()
{
    struct node* temp=head;
    if(head==NULL)
    {
        return ;
        
    }
    else{
        head=head->next;
        temp->next=NULL;
        free(temp);
    }
}
void deleteatend()
{
    struct node* temp=head,*x=head,*y=head;
    if(head==NULL)
    {
        return ;
    }
    else if(head->next==NULL)
    {
        head=head->next;
    }
    else{
        while(temp->next!=NULL)
        {
            y=temp;
            temp=temp->next;
            
        }
        y->next=NULL; 
        free(temp);
    }

}
void deleteatanypos(int m)
{struct node* temp=head,*x=head,*y;
    if(head==NULL)
    {
        return ;
    }
    else if(m==0)
    {
      head=head->next;
        temp->next=NULL;
        free(temp);
        
    }
   else{
       while(m--)
       {
           x=temp;
           temp=temp->next;
       }
       x->next=temp->next;
       temp->next=NULL;
       free(temp);
   }
}
void print()
{
    struct node* temp=head;
    while(temp!=NULL)
    {
       printf("%d ",temp->data);
        temp=temp->next;
         
    }
}
int main() {
int n,pos,data,t;
    scanf("%d",&n);
    while(n--)
    {
        scanf("%d",&t);
            if(t==1)
            {
        scanf("%d %d",&pos,&data);
        insertatpos(pos,data);
            }
        if(t==3)
        {
           scanf("%d",&data);
        insertatbegin(data);  
        }
         if(t==2)
        {
           scanf("%d",&data);
        insertatend(data);  
        }
    }
    int m;
    scanf("%d",&m);
    deleteatanypos( m);
    print();
    return 0;
}
