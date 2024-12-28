#include <stdio.h>
#include "Node.h"
#include <stdlib.h>

void insertNode(Node ** head, int data) {
    Node * newNode = (Node *)malloc(sizeof(Node));
    newNode->value = data;
    if (*head == NULL)
        newNode->next = NULL;
    else
        newNode->next = *head;
    *head = newNode;
}

void printfList(Node * p) {
    if (p == NULL)
        return;
    while(p) {
        printf("%d\n", p->value);
        p = p->next;
    }
}

int main(void) {
    Node * List = NULL;
    insertNode(&List, 1);
    insertNode(&List, 2);
    printfList(List);

    return 0;
}