void checkSume(char c, int sum)
{
	sum = (sum - 10) % 64;
	c = (char)(sum + 32);
}
