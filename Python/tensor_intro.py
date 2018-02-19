import tensorflow as tf


node1 = tf.constant(3.0, tf.float32)
node2 = tf.constant(4.0)

print(node1, node2)

sess = tf.Session()
sess.close()
print()

with tf.Session() as sess:
    output = sess.run([node1, node2])
    print(output)

print()

a = tf.constant(5.0)
b = tf.constant(6.0)
c = a * b
sess = tf.Session()

File_Writer = tf.summary.FileWriter('//Users//tall//Documents//Python//graph', sess.graph)
print(sess.run(c))

sess.close()

print()


c = tf.placeholder(tf.float32)
d = tf.placeholder(tf.float32)
adder_node = a + b
sess = tf.Session()
print(sess.run(adder_node, {a:[1,3], b:[2,4]}))