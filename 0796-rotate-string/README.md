<h2><a href="https://leetcode.com/problems/rotate-string/">796. Rotate String</a></h2><h3>Easy</h3><hr><div><p>Given two strings <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">s</code> and <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">goal</code>, return <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">true</code> <em style="color: rgb(234, 238, 241) !important;">if and only if</em> <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">s</code> <em style="color: rgb(234, 238, 241) !important;">can become</em> <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">goal</code> <em style="color: rgb(234, 238, 241) !important;">after some number of <strong>shifts</strong> on</em> <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">s</code>.</p>

<p>A <strong>shift</strong> on <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">s</code> consists of moving the leftmost character of <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">s</code> to the rightmost position.</p>

<ul>
	<li>For example, if <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">s = "abcde"</code>, then it will be <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">"bcdea"</code> after one shift.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre style="background-color: rgb(20, 28, 32) !important; color: rgb(182, 198, 206) !important;"><strong>Input:</strong> s = "abcde", goal = "cdeab"
<strong>Output:</strong> true
</pre><p><strong class="example">Example 2:</strong></p>
<pre style="background-color: rgb(20, 28, 32) !important; color: rgb(182, 198, 206) !important;"><strong>Input:</strong> s = "abcde", goal = "abced"
<strong>Output:</strong> false
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">1 &lt;= s.length, goal.length &lt;= 100</code></li>
	<li><code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">s</code> and <code style="background-color: rgb(20, 28, 32) !important; color: rgb(183, 198, 205) !important;">goal</code> consist of lowercase English letters.</li>
</ul>
</div>