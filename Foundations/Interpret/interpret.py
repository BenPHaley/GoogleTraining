def interpret(value, commands, args):
	i = 0
	length = len(commands);
	while (i < length):
		if ("+" == commands[i]):
			value += args[i]
		elif ("-" == commands[i]):
			value -= args[i]
		elif ("*" == commands[i]):
			value *= args[i]
		else:
			return -1
		i+=1;
	return value;
