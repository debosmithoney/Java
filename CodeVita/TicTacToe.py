line1 = [char for char in input()]
line2 = [char for char in input()]
line3 = [char for char in input()]
mat = [line1]+ [line2] + [line3]
freq_X, freq_O = (line1.count('X') + line2.count('X') + line3.count('X')),  (line1.count('O') + line2.count('O') + line3.count('O'))
if (all(ele == 'X' for ele in line1) and all(ele == 'O' for ele in line2)) or (all(ele == 'X' for ele in line1) and all(ele == 'O' for ele in line3)) or (all(ele == 'X' for ele in line3) and all(ele == 'O' for ele in line2)):
  print("NO")
elif (all(ele == 'O' for ele in line1) and all(ele == 'X' for ele in line2)) or (all(ele == 'O' for ele in line1) and all(ele == 'X' for ele in line3)) or (all(ele == 'O' for ele in line3) and all(ele == 'X' for ele in line2)):
  print("NO")
elif (mat[0][0]==mat[1][0]==mat[2][0]=='X' and mat[0][1]==mat[1][1]==mat[2][1]=='O') or (mat[0][0]==mat[1][0]==mat[2][0]=='X' and mat[0][2]==mat[1][2]==mat[2][2]=='O') or (mat[0][2]==mat[1][2]==mat[2][2]=='X' and mat[0][1]==mat[1][1]==mat[2][1]=='O'):
  print("NO")
elif (mat[0][0]==mat[1][0]==mat[2][0]=='O' and mat[0][1]==mat[1][1]==mat[2][1]=='X') or (mat[0][0]==mat[1][0]==mat[2][0]=='O' and mat[0][2]==mat[1][2]==mat[2][2]=='X') or (mat[0][2]==mat[1][2]==mat[2][2]=='O' and mat[0][1]==mat[1][1]==mat[2][1]=='X'):
  print("NO")
elif (freq_X != freq_O) and (freq_X != freq_O + 1):
  print("NO")
elif (all(ele == 'O' for ele in line1) or all(ele == 'O' for ele in line2) or all(ele == 'O' for ele in line3) or (mat[0][0]==mat[1][0]==mat[2][0]=='O') or (mat[0][1]==mat[1][1]==mat[2][1]=='O') or (mat[0][2]==mat[1][2]==mat[2][2]=='O') or (mat[0][0]==mat[1][1]==mat[2][2]=='O') or (mat[0][2]==mat[1][1]==mat[2][0]=='O')) and (freq_X != freq_O):
  print("NO")
elif (all(ele == 'X' for ele in line1) or all(ele == 'X' for ele in line2) or all(ele == 'X' for ele in line3) or (mat[0][0]==mat[1][0]==mat[2][0]=='X') or (mat[0][1]==mat[1][1]==mat[2][1]=='X') or (mat[0][2]==mat[1][2]==mat[2][2]=='X') or (mat[0][0]==mat[1][1]==mat[2][2]=='X') or (mat[0][2]==mat[1][1]==mat[2][0]=='X')) and (freq_X + 1 <= freq_O):
  print("NO")
else:
  print("YES")