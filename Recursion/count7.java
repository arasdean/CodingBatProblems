public int count7(int n) {

  if (n==7) return 1;
  else if (n==77) return 2;
  else if (n==777) return 3;
  else if(n != 7) return 0;
  else{
    int w= n%10;
    int y = n/10;
    return count7(w) + count7(y);
  }
}
