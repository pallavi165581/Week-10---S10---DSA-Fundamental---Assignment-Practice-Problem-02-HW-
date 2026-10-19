# Week 10 - S10 - DSA Fundamental - Assignment Practice Problem 02 (HW)

Category C · Coding Assignment — Arrays & Traversal Patterns

## Problems

1. `ScoreRangeCounter` — bucket scores into grade bands A/B/C/D/F; single traversal with five counters
2. `SecondLargestFinder` — find the second-largest distinct value in one pass (two-variable tracking)
3. `PairSumChecker` — detect if any two distinct elements sum to a target using a hash-set complement search
4. `RotateArrayLeft` — left-rotate by k places in O(1) extra space via the three-reversal trick
5. `FrequencyCounter` — count occurrences of each element preserving insertion order (LinkedHashMap)
6. `ClassAttendanceTracker` — count present days and longest unbroken present streak in a single pass

## Run

```bash
javac *.java

# Problem 6 — Class Attendance Tracker
printf "8\n1 1 0 1 1 1 0 1\n" | java ClassAttendanceTracker
# Expected: Present: 6, Longest streak: 3

# Problem 1 — Score Range Counter
printf "5\n92 75 60 45 30\n" | java ScoreRangeCounter

# Problem 2 — Second Largest Finder
printf "5\n10 20 4 45 99\n" | java SecondLargestFinder

# Problem 3 — Pair Sum Checker
printf "4\n1 4 45 6\n" && printf "16\n" | java PairSumChecker

# Problem 4 — Rotate Array Left
printf "5\n1 2 3 4 5\n" && printf "2\n" | java RotateArrayLeft

# Problem 5 — Frequency Counter
printf "7\n1 2 2 3 1 2 3\n" | java FrequencyCounter
```

## Complexity Notes

| Problem | Time | Space |
|---------|------|-------|
| ScoreRangeCounter | O(n) | O(1) |
| SecondLargestFinder | O(n) | O(1) |
| PairSumChecker | O(n) | O(n) |
| RotateArrayLeft | O(n) | O(1) |
| FrequencyCounter | O(n) | O(n) |
| ClassAttendanceTracker | O(n) | O(1) |

All problems can be solved in a **single pass** over the input array.
