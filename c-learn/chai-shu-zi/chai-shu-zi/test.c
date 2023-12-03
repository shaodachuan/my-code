#define  _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <time.h>


void  menu() {
	printf("******************************** \n");
	printf("********** 1. 猜数字 *********** \n");
	printf("********** 2. 退出   *********** \n");
	printf("******************************** \n");
}

void game() {
	// 随机数
	srand(time(NULL));
	int ret = rand() % 100 + 1;
	printf("%d \n", ret);

	/*int input;
	while (1) {
		printf("请输入一个数字(1-100):>");
		scanf("%d", &input);

		if (input > rand) {
			printf("猜大了 \n");
		}
		else if ( input < rand ) {
			printf("猜小了 \n");
		}
		else {
			printf("恭喜你, 猜对了 \n");
			break;
		}
	}*/

}


int main() {

	int input = 1; // 是否继续游戏
	
	while (1) {
		// 1. 输出菜单
		menu();

		// 2. 选择内容
		printf("请选择:>");
		scanf("%d", &input);

		// 3. 根据输入，执行内容
		if (input == 1) {
			printf("猜数字游戏 \n");
			game();
		}
		else if (input == 0) {
			printf("退出游戏 \n");
			break;
		} else{
			printf("输入非法，请重新输入 \n");
		}
	}


	return 0;
}
