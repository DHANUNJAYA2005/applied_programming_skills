class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();

        // Process each asteroid
        for (int i = 0; i < asteroids.length; i++) {

            int current = asteroids[i];

            // Right-moving asteroid
            if (current > 0) {
                stack.push(current);
            }
            // Left-moving asteroid
            else {
                int size = -current;

                // Destroy smaller right-moving asteroids
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < size) {
                    stack.pop();
                }

                // Equal size collision
                if (!stack.isEmpty() && stack.peek() == size) {
                    stack.pop();
                }
                // Larger right-moving asteroid survives
                else if (!stack.isEmpty() && stack.peek() > size) {
                    continue;
                }
                // Current asteroid survives
                else {
                    stack.push(-size);
                }
            }
        }

        // Convert stack to array (reverse order)
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}