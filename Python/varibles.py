import tensorflow as tf

# Model  Parameters
W = tf.Variable([-1.0], tf.float32)
b = tf.Variable([1.0], tf.float32)
x = tf.placeholder(tf.float32)


# Inputs and Outputs
linear_model = W * x + b


init = tf.global_variables_initializer()

sess = tf.Session()
sess.run(init)
print(sess.run(linear_model, {x:[1,2,3,4]}))

# loss
y = tf.placeholder(tf.float32)
# Loss
squared_deltas = tf.square(linear_model - y)
loss = tf.reduce_sum(squared_deltas)
print(sess.run(loss, {x:[1,2,3,4], y:[0,-1,-2,-3]}))

