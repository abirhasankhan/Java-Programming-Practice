public class Queue {
    int queue[];
    int front;
    int rear;
    int size;

    public Queue(int size){
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = 0;
    }

    public void enqueue(int x){

        if(rear<size){
            if(rear==0){
                front=0;
            }
            queue[rear]=x;
            rear++;
        }
        else{
            System.out.println("The queue is full");
        }

    }

    public void dequeue(){
        if(front!=rear){
            queue[front]=0;
            front++;
        }
        else{


            System.out.println("The queue is empty");
        }

    }

    public int peek(){
        return queue[front];

    }

    public void clear(){
        front=-1;
        rear=0;
        for(int i=0;i<size;i++){
            queue[i]=0;
        }

    }

    public boolean isFull(){
        if(rear==size-1)
        {
            return true;

        }
        else{
            return false;
        }}

    public boolean isEmpty(){
        if(front==rear||rear==0){
            return true;
        }
        else{
            return false;
        }
    }



    public String toString(){return this.queue+" "+this.size+" "+this.front+" "+this.rear;}

    public static void main(String[] args) {
        Queue q=new Queue(6);
        q.enqueue(10);
        q.enqueue(12);
        q.enqueue(16);
        q.enqueue(18);
        q.enqueue(20);
        q.enqueue(21);
        //q.enqueue(22);
        boolean a=q.isFull();
        System.out.println(a);
        q.clear();
        q.enqueue(6);
        q.dequeue();
        System.out.println(q.isEmpty());
    }
}
