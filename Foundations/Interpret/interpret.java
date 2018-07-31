public int interpret(int value, String[] commands, int[] args) {
	int operandLength = commands.length;
	int i = 0;
	while (i < operandLength) {
		switch (commands[i]) {
			case "+":
				value += args[i];
				break;
			case "-":
				value -= args[i];
				break;
			case "*":
				value *= args[i];
				break;
			default:
				return -1;
		}
		i++;
	}

	return value;
}
