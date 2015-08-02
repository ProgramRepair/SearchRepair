void grade(float A, float B, float C, float D, float grade, char* printf_tmp0)
{
	if (grade >= A) {
    printf_tmp0 = "Student has an A grade\n";
  } else
  if (grade >= B && grade <= A) {
    printf_tmp0 = "Student has an B grade\n";
  } else
  if (grade >= C && grade <= B) {
    printf_tmp0 = "Student has an C grade\n";
  } else
  if (grade >= D && grade <= C) {
    printf_tmp0 = "Student has an D grade\n";
  } else
  if (grade < D) {
    printf_tmp0 = "Student has failed the course\n";
  }
}
