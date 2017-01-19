"""
File:timeingtest1
Prints the times results for problem sizes that are doubling.
"""

import time

print "Starting...."

problemSize = 1000000
print "%12s%16s" % ("Problem Size", "Seconds")

for count in range(5):
    start = time.time()

    # The start of the algorithm

    work = 1
    for x in range(problemSize):
        work += 1
        work -= 1
    # The end of the algorithm
    elapsed = time.time() - start

    print "%12d%16.3f" % (problemSize, elapsed)
    problemSize *=2

print "\n\n"
problemSize1 = 1000000
for count in range(5):
    start = time.time()

    work1 = 1
    for j in range(problemSize1):
        for k in range(problemSize1):
            work1 += 1
            work1 -= 1
    elapsed = time.time() - start

    print "%12d%16.3f" % (problemSize1, elapsed)
    problemSize1 *=2

print "....The End"