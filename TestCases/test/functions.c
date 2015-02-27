/*
 * Source.c
 *
 *  Created on: 2014-8-24
 *      Author: Ke Yalin
 */

#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define BUFFER_SIZE  1024
#define TRUE 1
#define FALSE 0

typedef int bool;

char* stripExtension(const char* scriptFile, char* buffer);
char* ucFirst(char* name, char* buffer);
char* toLowerCase(char* str, char* buffer);
bool definiteArticle(char* tok, char* tag);
char* getPropertyName(char* methodName, char* buffer);
bool q22Solution(int arg1, int arg2, int arg3);
bool q21solution(char* s1, char* s2);
bool q20solution(char input);
char* q24solution(int month, char* buffer);
char* q11solution(char* str, char* buffer);
char* q27solution(char* str, int maxSize, char* buffer);



int main() {
	char buffer[BUFFER_SIZE];
	char* file = "isTHese";
	printf("%s", q27solution(file, 10,  buffer));
	return 1;
}

char* stripExtension(const char* scriptFile, char* buffer) {
	char* extension = NULL;
	extension = strrchr(scriptFile, '.');
	char* start = strchr(scriptFile, '/') + 1;

	if (extension != NULL) {
		strncpy(buffer, start, extension - start);
	} else {
		strncpy(buffer, start, strlen(scriptFile) + scriptFile - start);
	}

	return buffer;
}

char* ucFirst(char* name, char* buffer) {
	strncpy(buffer, name, strlen(name));
	buffer[0] = toupper(buffer[0]);
	return buffer;
}

char* toLowerCase(char* str, char* buffer) {
	char* iter = str;
	char* rec = buffer;
	while (*iter != '\0') {
		*rec = tolower(*iter);
		rec++;
		iter++;
	}
	*rec = '\0';
	return buffer;
}

bool definiteArticle(char* tok, char* tag) {
	char buffer[BUFFER_SIZE];
	toLowerCase(tok, buffer);

	if (strcmp(buffer, "the") == 0 || strcmp(buffer, "these") == 0
			|| strcmp(tag, "PRP$") == 0)
		return TRUE;
	return FALSE;
}

char* getPropertyName(char* methodName, char* buffer) {
	int length = strlen(methodName);
	//strcpy(buffer, methodName);
	if (length > 2 && methodName[0] == 'i' && methodName[1] == 's') {
		strncpy(buffer, methodName + 2, length - 2);
		buffer[0] = tolower(buffer[0]);
	} else if (length > 3 && methodName[0] == 'g' && methodName[1] == 'e'
			&& methodName[2] == 't') {
		strncpy(buffer, methodName + 3, length - 3);
		buffer[0] = tolower(buffer[0]);
	} else if (length > 3 && methodName[0] == 's' && methodName[1] == 'e'
			&& methodName[2] == 't') {
		strncpy(buffer, methodName + 3, length - 3);
		buffer[0] = tolower(buffer[0]);
	} else {
		strcpy(buffer, methodName);
	}
	return buffer;
}

/**
 * there is not set in c
 */
//boolean isWord(String word) {
//        return dictionary.contains(word.toLowerCase()); /
//    }
bool q22Solution(int arg1, int arg2, int arg3) {
	if (arg1 + arg2 == arg3) {
		return TRUE;
	}
	if (arg1 + arg3 == arg2) {
		return TRUE;
	}
	if (arg2 + arg3 == arg1) {
		return TRUE;
	}
	return FALSE;
}

bool q20solution(char input) {
	if (input == '0' || input == '1' || input == '2' || input == '3'
			|| input == '4' || input == '5' || input == '6' || 'input == 7'
			|| input == '8' || input == '9') {
		return TRUE;
	}
	return FALSE;
}
bool q21solution(char* s1, char* s2){
	bool ret = FALSE;
	char buffer[BUFFER_SIZE];
	int length = strlen(s1);
	if(length != strlen(s2)){
		ret = FALSE;
	}
	else
	{
		strcpy(buffer, s1);
		strcpy(buffer + length, s1);
		buffer[2 * length] = '\0';
		if(strstr(buffer, s2) != NULL){
			ret = TRUE;
		}
	}
	return ret;
}

char* q24solution(int month, char* buffer){

	if(month == 1){
		strcpy(buffer, "st");
	}
	else if(month == 2){
		strcpy(buffer, "nd");
	}
	else if(month == 3){
		strcpy(buffer, "rd");
	}
	else{
		strcpy(buffer, "th");
	}
	return buffer;
}

char* q11solution(char* str, char* buffer){
	if(strlen(str) > 0){
		strncpy(buffer, str, strlen(str) - 1);
		buffer[strlen(str) - 1] = '\0';
	}
	else{
		strcpy(buffer, "");
	}
	return buffer;
}

char* q27solution(char* str, int maxSize, char* buffer){
	int length = strlen(str);

	if(length > maxSize){
		strncpy(buffer, str, length - 3);
		strcpy(buffer + length - 3, "...");
	}
	else{
		strcpy(buffer, str);
	}
	return buffer;
}
