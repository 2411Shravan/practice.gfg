// Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

// Input:
// The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

// Output:
// For each testcase, in a new line, output the rotated array.

// Constraints:
// 1 <= T <= 200
// 1 <= N <= 107
// 1 <= D <= N
// 0 <= arr[i] <= 105

// Example:
// Input:
// 2
// 5 2
// 1 2 3 4 5 
// 10 3
// 2 4 6 8 10 12 14 16 18 20

// Output:
// 3 4 5 1 2
// 8 10 12 14 16 18 20 2 4 6

// Explanation :
// Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.


void rotate_array(int *numbers, int number_of_elements, int rotations);

int main() {
int number_tests = 0, number_of_elements = 0, rotations = 0, mod = 0;
scanf("%d", &number_tests);
for(int i = 0; i < number_tests; i++){
scanf("%d %d", &number_of_elements, &rotations);
int *numbers = (int)malloc(sizeof(int) * number_of_elements);
for(int j = 0; j < number_of_elements; j++) {
scanf("%d", &numbers[j]);
}
if(number_of_elements >= rotations) {
rotate_array(numbers, number_of_elements, rotations);
}
else {
mod = (rotations % number_of_elements);
rotate_array(numbers, number_of_elements, mod + 1);
}

}
return 0;
}

void rotate_array(int *numbers, int number_of_elements, int rotations){

for(int i = rotations; i < number_of_elements; i++) {
printf("%d ", numbers[i]);
}
for(int i = 0; i < rotations; i++) {
printf("%d ", numbers[i]);
}
printf("\n");
}