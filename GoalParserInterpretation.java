class GoalParserInterpretation {
        public String interpret(String command) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < command.length(); i++) {
                if (command.charAt(i) == 'G') {
                    result.append("G");
                }
                else if (command.startsWith("()", i)) {
                    result.append("o");
                    i++;
                }
                else if (command.startsWith("(al)", i)) {
                    result.append("al");
                    i += 3;
                }
            }
            return result.toString();
        }
}
