package sliding window.variableSize;

public class countSubarraysWithSizeLessThanK {
        public long countSubarrays(int[] arr, long k) {

        long count = 0;
        long sum = 0;

        int left = 0;
        int length = 0;

        for (int right = 0; right < arr.length; right++) {

            length++;
            sum += arr[right];

            long score = sum * length;

            while (score >= k) {
                sum -= arr[left];
                left++;
                length--;

                score = sum * length;
            }

            count += right - left + 1;
        }

        return count;
        }
}
