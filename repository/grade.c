char
user_grade(float percent, float a, float b, float c, float d)
{
  if (percent < d)
    return 'F';
  else if ((percent >= d) && (percent < c))
    return 'D';
  else if ((percent >= c) && (percent < b))
    return 'C';
  else if ((percent >= b) && (percent < a))
    return 'B';
  else
    return 'A';
}
