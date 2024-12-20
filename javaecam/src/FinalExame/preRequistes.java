package FinalExame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

;

public class preRequistes {

	   public static void main(String[] args) {
	        int numCourses = 4;
	        int[][] prerequisites = {{1, 0},{2,0},{3,1},{3,2}};
	        System.out.println(Arrays.toString(findOrder(numCourses, prerequisites)));
	    }

	    public static int[] findOrder(int numCourses, int[][] prerequisites) {
	        int[] indegree = new int[numCourses];
	        List<List<Integer>> graph = new ArrayList<>();

	        for (int i = 0; i < numCourses; i++) {
	            graph.add(new ArrayList<>());
	        }

	        for (int[] prereq : prerequisites) {
	            graph.get(prereq[1]).add(prereq[0]);
	            indegree[prereq[0]]++;
	        }

	        Queue<Integer> queue = new LinkedList<>();
	        for (int i = 0; i < numCourses; i++) {
	            if (indegree[i] == 0) {
	                queue.add(i);
	            }
	        }
	        int[] res = new int[numCourses];
	        int index = 0;
	        while (!queue.isEmpty()) {
	            int course = queue.poll();
	            res[index++] = course;

	            for (int neighbor : graph.get(course)) {
	                indegree[neighbor]--;
	                if (indegree[neighbor] == 0) {
	                    queue.add(neighbor);
	                }
	            }
	        }

	        return index == numCourses ? res : new int[0];
	    }


	    }
	    
