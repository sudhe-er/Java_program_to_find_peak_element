public int peakElement(int[] arr,int n)
    {
       if(n==1) return 0;
  
       if(arr[0]>arr[1]) return 0;          //Checks if 1st element is the peak element. 
  
      if(arr[n-1]>arr[n-2]) return n-1;     //Checks if last element is the peak element
      
      int low = 1, high = n-2;
      
      while(low<=high)                      //Binary Search Approach
       {
      
          int mid = (high+low)/2;           //Initialising Mid value
          
          if(arr[mid]>=arr[mid-1]&&arr[mid]>=arr[mid+1]) return mid;      //Checking for peak element
            
          else if(arr[mid]<arr[mid-1]) high = mid-1; 
        //Updating the high variable
          else low = mid+1;
        //updating the low variable
       }
        return -1;
    }
