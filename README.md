**Hash map:** A *hash map* is a data structure that can map *keys* to *values*. It uses a *hash function* to compute an *index* (hash code) into an array of *buckets* or *chains*, from which value can be retrieved.
**Hash function:** Hash function will assign unique key to a bucket, but hash function can generates the same index for more than one key.
The hash function used in this program is modular hashing.
	int hash = 0;
	for (int i = 0; i < s.toString().length(); i++)
		hash = hash + s.toString().length()
	hash %= M;
