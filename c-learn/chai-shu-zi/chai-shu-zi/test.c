#define  _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <time.h>


void  menu() {
	printf("******************************** \n");
	printf("********** 1. ������ *********** \n");
	printf("********** 2. �˳�   *********** \n");
	printf("******************************** \n");
}

void game() {
	// �����
	srand(time(NULL));
	int ret = rand() % 100 + 1;
	printf("%d \n", ret);

	/*int input;
	while (1) {
		printf("������һ������(1-100):>");
		scanf("%d", &input);

		if (input > rand) {
			printf("�´��� \n");
		}
		else if ( input < rand ) {
			printf("��С�� \n");
		}
		else {
			printf("��ϲ��, �¶��� \n");
			break;
		}
	}*/

}


int main() {

	int input = 1; // �Ƿ������Ϸ
	
	while (1) {
		// 1. ����˵�
		menu();

		// 2. ѡ������
		printf("��ѡ��:>");
		scanf("%d", &input);

		// 3. �������룬ִ������
		if (input == 1) {
			printf("��������Ϸ \n");
			game();
		}
		else if (input == 0) {
			printf("�˳���Ϸ \n");
			break;
		} else{
			printf("����Ƿ������������� \n");
		}
	}


	return 0;
}
