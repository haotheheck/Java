package cs265;

class CFG {

	   int value1, value2;
	   int last_largest, last_smallest;

	                           // Line numbers

	   int largest()             // 1
	   {                         // 2
	      int value=value1;      // 3
	      if (value2>value1)     // 4
	         value = value2;     // 5
	      last_largest = value;  // 6
	      return value;          // 7
	   }                         // 8

	   int smallest()             // 2
	   {                          // 2
	      int value=0;            // 3
	      if (value1>value2)      // 4
	         value = value2;      // 5
	      else                    // 6
	         value = value1;      // 7
	      last_smallest = value;  // 8
	      return value;           // 9
	   }                          // 10

	   void addTriangular(int x)  // 1
	   {                          // 2
	      int i=x;                // 3
	      while (x>0) {           // 4
	         value1 += i;         // 5
	         i--;                 // 6
	      }                       // 7
	   }                          // 8

	   void modify()               // 1
	   {                           // 2
	      int test=1;              // 3
	      while (test < value1) {  // 4
	         if (test==value2)     // 5
	            value1 -= 1;       // 6
	         else                  // 7
	            value2 += value1;  // 8
	         test++;               // 9
	      }                        // 10
	   }                           // 11

	   int power_lt(int n)             // 1
	   {                               // 2
	      int value=2;                 // 3
	      int power=1;                 // 4
	      if (n==1) {                  // 5
	         while (value1 > value) {  // 6
	            power++;               // 7
	            value=value*2;         // 8
	         }                         // 9
	      }                            // 10
	      else {                       // 11
	         while (value2 > value) {  // 12
	            power++;               // 13
	            value=value*2;         // 14
	         }                         // 15
	      }                            // 16
	      return power;                // 17
	   }                               // 18

	}
