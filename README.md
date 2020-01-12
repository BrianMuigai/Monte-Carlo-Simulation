# Monte-Carlo-Simulation
a sample usage of Monte Carlo in simulation

**Monte-Carlo Simulation**: is a scheme employing random numbers that are 
$u(0,1)$ random variates. it is used to solve certain stochastic and deterministic problems
where the passage of time plays no role. Monte-Carlo-Simulation are 
generally static rather than dynamic.

##Base knowledge
**calculus**
**Theory of Estimation**
**Theory of Hypothesis**

##Example
Suppose that we want to evaluate
$I=\int_{a}^{b} g(x)dx$
where $g(x)$ is a real valued function that is not analytically integrable.
This is a deterministic problem and can be approached by Monte-Carlo-Simulation method in the following way:
$let Y be random variable (b - a)g(x) where X is a continuous random variable distributed uniformly on [a,b], 
then the expected value of Y is$
$E(y)=E[(b - a)g(x)]$
\t\t$=(b - a)E[g(x)]$
\t\t$=(b - a)\int_{a}^{b} g(x)f(x)dx$
\t\t$=(b - a)\frac{\int_{a}^{b} g(x)dx}{b - a}$
\t\t$=I$
$where f(x) = \frac{1}{b - a} is the p.d.f of U(a, b) random variables$
the problem of evaluating the integral has been  reduced to one of estimating the expected value&E(Y)$. We estimate $E(Y) = I$ by the sample mean
$\vec{Y}(n)=\frac{\sum_{i=1}^{n}}{n} = \frac{(b - a)\sum{i=1}^{n}g(x)}{n}$
where x1, x2, ......, xn are IID U(a, b) random variables.
$\vec{Y}$ can be seen as an estimate of a rectangle that has a base of length $b - a$ and height $\frac{I}{b-a}$ which is a continuous average of $g(x)$ over [a,b]. Further, it can be shown that:
$E[\vec{Y}(n)]=I$
i.e $\vec{Y}$ is an unbiased estimate of I and 
$var[\vec{Y}(n)]=\frac{var(Y)}{n}$
Assuming that $var(Y)$ is finite, it follows that $\vec{Y}(n)$ will be arbitrary close to &I& for sufficiently large &n&.

**sample problem**: 
$I=\int_{0}^{\pie} sin(x)dx}$
in elementary calculus, $\int_{0}^{\pie} sin(x)dx = 2$

## Usage
first make sure you have java installed in your machine. You have to build Montecarlo.java by typing javac Montecarlo.java
after successfull build, run the code by typing java Montecarlo

##Conclusion
from the output, you will see that the results of i is close to 2. Rounding off will result to 2
